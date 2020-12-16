import React,{ Component } from 'react'


export default class SignUpCard extends Component {


  constructor(props){
    super(props);
this.state={
    contacts:[{'id':0,'firstName':'Pluto','lastName':'dwarf','email':'@1lightyear'},
    {'id':1,'firstName':'Neptune','lastName':'with some tune','email':'@2lightyear'}]
};
}

    render()
    {
        return(
          <>


        <div className="row">
          <div className="col s12 m6">
            <div className="card #eceff1 blue-grey lighten-5">
              <div className="card-content white-text">
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
                <div className="input-field col 6">
                  <input ref="email" type="email" className="validate"/>
                  <label htmlFor="email">Email</label>
                </div>
                <div className="input-field col 6">
                  <input ref="password" type="password" className="validate"/>
                  <label htmlFor="email">Password</label>
                </div>
              </div>



                </div>
          <div className="card-action">
              <div className="row">
                  <button className ="waves-effect waves-light btn" type="submit" name="action">Submit</button>
               </div>
          </div>
          </div>
          </div>
        </div>



            <div className="row">
              
            <form className="col s4" >


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
                <div className="input-field col 6">
                  <input ref="email" type="email" className="validate"/>
                  <label htmlFor="email">Email</label>
                </div>
                <div className="input-field col 6">
                  <input ref="password" type="password" className="validate"/>
                  <label htmlFor="email">Password</label>
                </div>
              </div>
              <div className="row">

                  <button className ="waves-effect waves-light btn" type="submit" name="action">Submit</button>
                
              </div>





            </form>


            </div>

            
                
        


            </>
        )
    }
}