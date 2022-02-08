import React from 'react'

class Car extends React.Component {
    constructor() {
        super()
        this.state= {
            id:'102',
            firstname:'Sachin',
            lastname:'A',
            org : 'Wirpo'
        }
    }
    render() { 
        return (
            <>
            <h2> Employee Id : {this.state.id} </h2>
            <h2> Employee Firstname : {this.state.firstname} </h2>
            <h2> Employess lastname : {this.state.lastname} </h2>
            <h2> Employess org : {this.state.org} </h2>
            </>
        );
    }
}
export default Car;