import React,{Component} from 'react'
import SingleContact from './SingleContact.js'
import AddContact from './AddContact'




export default class Contacts extends Component{

constructor(props){
    super(props);
this.state={
    contacts:[{'id':0,'firstName':'Pluto','lastName':'dwarf','email':'@1lightyear'},
    {'id':1,'firstName':'Neptune','lastName':'with some tune','email':'@2lightyear'}]
};
}


componentDidMount()
{
    fetch("http://localhost:8080/api/all-contact")
    .then(response => response.json())
    .then(data => this.setState({contacts:data}))


    // fetch("http://localhost:8080/api/all-contact",
    // {
    //     method:"GET",
    //     headers:{"content-type":"application/json",
    //     "Access-Control-Allow-Origin": "*" }
    // }) .then(response => response.json())
    // .then(data => this.setState({contacts:data}))
}

    render()
    {
        return(
            <div>
                <div className="row">
                    <AddContact/>
                </div>
                <div className="row">
                {
                    this.state.contacts.map((item) => (
                        <SingleContact key={item.id} item={item} />
                    ))
                }
                </div>
            </div>

        )
    }

}