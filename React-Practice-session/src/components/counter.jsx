import React, { Component } from 'react';

//Class component 
class Counter extends Component {
    state = {
        count : 0,
    }       
    render() { 
       return (
        <div>          
            <span style={{ fontsize : 30}} className="badge bg-secondary m-2">
                {this.fomratCount()}
            </span>
            <button className="btn btn-success btn-sm">Increment</button>
        </div>
       )}
       fomratCount(){
           const { count } = this.state;
           return count === 0 ? 'Zero' : count
       }
}
export default Counter;