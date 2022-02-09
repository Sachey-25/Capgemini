import axios from 'axios'

const USERS_REST_API_URL = 'http://localhost:8081/api/users';

//Components
class UserService{
    getUsers(){
        //Mapping the http method - get()
       return axios.get(USERS_REST_API_URL)
    }
}
export default new UserService();