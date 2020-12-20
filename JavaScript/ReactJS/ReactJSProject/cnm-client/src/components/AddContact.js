import React,{ Component } from 'react'


export default class AddContact extends Component {


    submitContact(event)
    {
      //console.log("in submit contact");

        event.preventDefault();
        //console.log(this.refs.firstName.value);

        let contact ={
            firstName:this.refs.firstName.value,
            lastName:this.refs.lastName.value,
            email:this.refs.email.value,
        }

        //console.log(contact);


        fetch("http://localhost:8080/api/save-contact",
        {
            method:"POST",
            headers:{"content-type":"application/json",},
            body:JSON.stringify(contact)
        }).then(response => response.json());


        window.location.reload();
    
    }

    render()
    {
        return(
            <div className="row">
            <form className="col s12" onSubmit={this.submitContact.bind(this)}>


            <div className="row">
                <div className="input-field col s6">
                  <input placeholder="Placeholder" ref="firstName" type="text" className="validate"/>
                  <label htmlFor="firstName">First Name</label>
                </div>
                <div className="input-field col s6">
                  <input ref="lastName" type="text" className="validate"/>
                  <label htmlFor="lastName">Last Name</label>
                </div>
              </div>
              <div className="row">
                <div className="input-field col s12">
                  <input ref="email" type="email" className="validate"/>
                  <label htmlFor="email">Email</label>
                </div>
              </div>
              <div className="row">

                  <button className ="waves-effect waves-light btn" type="submit" name="action">Submit</button>
                
              </div>





            </form>


            </div>

            
                
        



        )
    }
}