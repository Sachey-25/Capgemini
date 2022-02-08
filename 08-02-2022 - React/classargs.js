import React from 'react'

class Car extends React.Component {
    constructor(props) { //props are considered as argument
        super(props); 
        this.state = { 
            brand: 'ford',
            model : 'Ecosport',
            color :'white',
            year : '2020'
         } //Javascript Objects
    }
    render() { 
        return ( 
        <div>
        <h2> I have {this.state.brand} car.</h2>
        <p> It is a {this.state.model} from {this.state.year} </p> 
        </div> 
        );
    }
}
export default Car;