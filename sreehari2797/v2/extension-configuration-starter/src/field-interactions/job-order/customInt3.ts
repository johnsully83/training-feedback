const interaction: FieldInteraction = {
    fieldName: 'customInt3',
    name: 'win-wash-lost',
    event: 'init',
    sortOrder: 0,
    invokeOnInit: true,
    script: (API: FieldInteractionAPI) => {
      /*
        john.sullivan - this looks good!
       */
      const myClient = {



        init: () => {


            myClient.disableField();


        },


        disableField: () => {

            API.disable('customInt3')

        }

      };

      return myClient.init();

    },
  };

  export default interaction;
