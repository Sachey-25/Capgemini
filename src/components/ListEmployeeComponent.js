import React, { Component }from 'react'
import EmployeeService from '../services/EmployeeService'

class ListEmployeeComponent extends Component{
    constructor(props){
        super(props)
        this.state={
            employees: []
        }
        this.addEmployee = this.addEmployee.bind(this)
    }
    componentDidMount(){
        EmployeeService.getEmployees().then( (response) =>{
            this.setState({ employees: response.data })
        })
    }
    addEmployee(){
        this.props.history.push('/add-employee')
    }

    render(){
        return(
            <div>
                <h2 className = "text-center">Employee List </h2>
                    <button className="btn btn-lg btn-primary" onClick={ this.addEmployee }> Sign in </button> 
                    <button className="btn btn-lg btn-primary" onClick={ this.addEmployee }> log in </button> 
                <div className = "row">
                    <table className = "table table-striped">                
                        <thead>
                            <tr>
                            <th>Employee Id </th>
                                <th> Employee First Name </th>
                                <th> Employee Last Name </th>
                                <th> Employee Email ID </th>
                                <th> Actions </th>
                            </tr>
                        </thead>
                        <tbody>
                            {
                                this.state.employees.map(
                                    employee =>
                                    <tr key = { employee.id }>
                                        <td>{ employee.id }</td>
                                        <td>{ employee.firstName }</td>
                                        <td>{ employee.lastName }</td>
                                        <td> { employee.emilId } </td>
                                    </tr>
                                )
                            }
                        </tbody>
                    </table>
                </div>
            </div>
        )
    }
}
export default ListEmployeeComponent;