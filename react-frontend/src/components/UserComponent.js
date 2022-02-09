import React from 'react'

import UserService from '../services/UserService'

class UserComponent extends React.Component {
    constructor(props){
        super(props)
        this.state = {  
            users:[]
        } 
    }

    componentDidMount(){
        UserService.getUsers().then( (response) => {
            this.setState({ users: response.data })
        } )
    }    
    render() { 
        return (
            <div className="container">
                <h1 className= "text-center">UsersList</h1>
                <table className= "table table-striped">
                    <thead>
                        <tr>
                            <td>UserId</td>
                            <td>User first Name</td>
                            <td>User Last Name</td>
                            <td>User Email Id</td>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.users.map(
                                user => 
                                <tr key = {user.id}>
                                    <td> {user.id} </td>
                                    <td> {user.firstname} </td>
                                    <td> {user.lastname} </td>
                                    <td> {user.email} </td>
                                </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>
        );
    }
}
 
export default UserComponent;