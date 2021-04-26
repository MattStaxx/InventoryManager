import React from 'react';
import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import ListVehicleComponent from './components/ListVehicleComponent';
// import HeaderComponent from './components/HeaderComponent';
// import FooterComponent from './components/FooterComponent';
// import CreateEmployeeComponent from './components/CreateEmployeeComponent';
// import ViewEmployeeComponent from './components/ViewEmployeeComponent';

function App() {
  return (
    <div>
        <Router>
              {/* <HeaderComponent /> */}
                <div className="container">
                    <Switch> 
                          <Route path = "/" exact component = {ListVehicleComponent}></Route>
                          <Route path = "/api/vehicles" component = {ListVehicleComponent}></Route>
                    </Switch>
                </div>
        </Router>
    </div>
  );
}

export default App;