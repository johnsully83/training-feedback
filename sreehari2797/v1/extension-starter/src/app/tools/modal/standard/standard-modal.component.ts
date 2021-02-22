import {Component} from '@angular/core';

import {NovoModalParams, NovoModalRef} from 'novo-elements';

import {StandardModalParams} from '../modal.types';

@Component({
  selector: 'standard-modal',
  templateUrl: './standard-modal.component.html',
  styleUrls: ['./standard-modal.component.scss']
})
export class StandardModalComponent {

  public modalParams: StandardModalParams;

  constructor(private modalRef: NovoModalRef, modalParams: NovoModalParams) {
    this.modalParams = StandardModalParams.fromNovo(modalParams);
  }

  close() {
    if (this.modalParams.onClose !== undefined) {
      this.modalParams.onClose(false);
    }

    this.modalRef.close(false);
  }

  yes() {
    if (this.modalParams.onClose !== undefined) {
      this.modalParams.onClose(true);
    }

    this.modalRef.close(true);
  }

}
