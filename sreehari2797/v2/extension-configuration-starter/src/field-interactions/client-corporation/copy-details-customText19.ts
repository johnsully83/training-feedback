const interaction: FieldInteraction = {
    fieldName: 'customText19',
    name: 'copy-details',
    event: 'change',
    sortOrder: 0,
    invokeOnInit: true,
    script: (API: FieldInteractionAPI) => {
      /*
        john.sullivan - this looks good!  i believe this would work as designed!
        Only issues are the wrong quotes for interpolation again, and httpGet instead of GET
       */
      const myClient = {

        change: () => {
          const customText19 = API.getValue('customText19');

          if(customText19!==undefined) {
              API.appBridge.httpGet('/entity/ClientContact/${customText19}?fields=email,phone').then( response => {
                API.setValue('customText18 ',response.data.data.email);
                API.setValue('customText20 ',response.data.data.phone);

              })

          } else {
              API.setValue('customText18','');
              API.setValue('customText20','');


          }



        },


      };

      return myClient.change();

    },
  };

  export default interaction;
