//Function and class components 
import React from 'react'
import Car from './classargs'
import Header from './mount'
import Example from './Events/event'
import Machine from './Events/eventsobjects'
import Cars from './Lists/lists'
import Garage from './Lists/listkeys'
import Coding from './Lists/listexample'
import Myform from './Forms/form'
//functional implementation
// The simplest way to define to a component - Building block of react
//JavaScript - Functions
 function display(){
     return(
         <div>      
             <h2> Welcome to the react </h2>
             <h3> Statement </h3>
             <h2> Statements </h2>
             <Car /> 
             <p>componentDidMount() method is called after the component is render</p>
             <Header />
             <Example />
             <Machine />
             <h1> The list is going to be like </h1>
             <Cars />
             <h1> This is anothe list </h1>
             <Garage />
             <h2>List of coureses </h2>
             <Coding />
             <Myform />
         </div>  
     );
}
export default display