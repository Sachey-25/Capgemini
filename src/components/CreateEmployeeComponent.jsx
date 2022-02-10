import React, { Component } from 'react'
import EmployeeService from '../services/EmployeeService'

class CreateEmployeeComponent extends Component {
constructor(props){
    super(props)
    this.state={
        firstName:'',
        lastName:'',
        emilId: ''

    }
    this.changeFirstNameHandler = this.changeFirstNameHandler.bind(this)
    this.changeLastNameHandler = this.changeLastNameHandler.bind(this)
    this.changeEmailHandler = this.changeEmailHandler.bind(this)
    this.saveEmployee = this.saveEmployee.bind(this)
    }

    saveEmployee = (e) => {
        e.preventDefault()
        let employee = {
            firstName: this.state.firstName,
            lastName: this.state.lastName,
            emilId: this.state.emilId
        }
        console.log('employee => ' + JSON.stringify(employee))
        EmployeeService.cretaeEmployee(employee).then( (response ) => {
            this.props.history.push('/employees')
        })
    }

    changeFirstNameHandler(event){
        this.setState({ firstName: event.target.value })
    }

    changeLastNameHandler(event){
        this.setState({ lastName: event.target.value })
    }
    changeEmailHandler(event){
        this.setState( { emilId: event.target.value })
    }
    cancel(){
        this.props.history.push('/employees')
    }
render(){
    return(
        <div>
            <h1> Employee Form </h1>
            <div className="container">
                <div className="row">
                    <div className="card col-md-6 offset-md-3 offset-md-3">
                        <h3 clasName="text-center">Add Employee</h3>
                        <div className="card-body">
                            <form>
                                <div className = "form-group">
                                    <label> First Name: </label>
                                    <input placeholder="First Name" name="firstName" className="form-control"
                                    value={ this.state.firstName } onChange={ this.changeFirstNameHandler } />
                                 </div>

                                  <div className = "form-group">
                                    <label> Last Name: </label>
                                    <input placeholder="Last Name" name="lastName" className="form-control"
                                    value={ this.state.lastName } onChange={ this.changeLastNameHandler } />
                                 </div>

                                 <div className = "form-group">
                                    <label> Email Id: </label>
                                    <input placeholder="Email address" name="emailId" className="form-control"
                                    value={ this.state.emilId } onChange={ this.changeEmailHandler } />
                                 </div>
                                 <button classsName="btn btn-success" onClick={ this.saveEmployee }>Save</button>
                                 <button className="btn btn-danger" onClick= { this.cancel.bind(this)}
                                 style={{marginLeft:"10px"}}>Cancel</button>
                           </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )}
}
export default CreateEmployeeComponent;