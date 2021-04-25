import React, { Component } from 'react';
import VehicleService from '../services/VehicleService';

class ListVehicleComponent extends Component {
    constructor(props) {
        super(props);

        this.state = {
            vehicles: []
        }
        
    }
    componentDidMount() {
        VehicleService.getVehicles().then((res) => {
            this.setState({vehicles: res.data});
        });
    }

    render() {
        return(
            <div>
                <h2 className='text-center'>Vehicles List</h2>
                <div className='row'>
                    <button className='btn btn-primary' onClick={this.vehicle}>Add Vehicle</button>
                </div>
                <br></br>
                <div>
                    <table className='table table-striped table-bordered'>
                        <thead>
                            <tr>
                                <th>Vehicle Name</th>
                                <th>Vehicle Color</th>
                                <th>Crew Size</th>
                                <th>Passenger Cap.</th>
                                <th>Price</th>
                            </tr>
                        </thead>
                        <tbody>
                            {
                                this.state.vehicles.map(
                                    vehicle =>
                                    <tr key = {vehicle.id}>
                                        <td>{vehicle.name}</td>
                                        <td>{vehicle.color}</td>
                                        <td>{vehicle.crew}</td>
                                        <td>{vehicle.passengers}</td>
                                        <td>{vehicle.price}</td>
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

export default ListVehicleComponent;