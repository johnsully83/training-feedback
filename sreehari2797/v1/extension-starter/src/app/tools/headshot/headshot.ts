import { AppBridgeService } from "../service/app-bridge.service";
import {NovoElementProviders, NovoElementsModule} from 'novo-elements';


/*
  So the business logic here is good...I believe everything you have in typescript is roughly what it should look like logic-wise
  
  However this is not an Angular @Component, and thus this file wouldn't build or run.  Try poking around angular.io (e.g. https://angular.io/guide/architecture-components)
  
  https://github.com/johnsully83/extension-starter/blob/master/src/app/app.component.ts
  is an example in this repository, although there isn't much going on.  Your HTML here will likely just consist of an <img /> tag
*/

public url: string;
private readonly entityId: number;


constructor(
    private novoModalService: NovoModalService,
    private appBridgeService: AppBridgeService,
    private location: Location
    
) {
    this.entityId = this.getBullhornId('EntityID');
}

    ngOnInit() {
        const url =  this.location.path(true);
        const candidateId = url.search.split('EntityId=')[1];

        this.appBridgeService.promise().then (appbridge => {
            appbridge.httpGET('/query/CandidateFileAttachment?where=candidate.id=${candidateId} AND type='Photo'').then(response =>
                {
                    const file = response.data.data[0];

                    if (file)
                    {
                        this.url = "data:${contentType}/${contentSubType};base64,${data}";
                    }
                    else {
                        this.url="";
                    }

                    
                })
        })
    }

    private getBullhornId(param: string): number {
        return parseInt(this.route.snapshot.queryParamMap.get(param), 10);
    }
