import axios from 'axios'

const EMPLOYEE_API_BASE_URL="http://localhost:8081/api/v1/employees"

class EmployeeService{
    getEmployees(){
        return axios.get(EMPLOYEE_API_BASE_URL)
    }
    cretaeEmployee(employee){
        return axios.post(EMPLOYEE_API_BASE_URL,employee)
    }
}
export default new EmployeeService();