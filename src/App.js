import FooterComponent from './components/FooterComponent';
import HeaderComponent from './components/HeaderComponent';
import ListEmployeeComponent  from './components/ListEmployeeComponent'
import CreateEmployeeComponent  from './components/CreateEmployeeComponent'
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'

function App() {
  return (
    <div>
      <Router>
        <div className="container">
          <HeaderComponent />
          <div className="container">
            <Switch> 
                      <Route path="/" exact component = { ListEmployeeComponent }></Route>
                      <Route path="/employees" component = { ListEmployeeComponent }></Route>
                      <Route path="/add-employee" component = { CreateEmployeeComponent }></Route>
                      <ListEmployeeComponent />
                      <CreateEmployeeComponent />
            </Switch>           
          </div>
          <FooterComponent />
        </div>
      </Router>
    </div>
   );
}
export default App;