//Function and class components 
import React from 'react'

import {Home} from './components/Home'
import {Header} from './components/Header'

//functional implementation
// The simplest way to define to a component - Building block of react
//JavaScript - Functions
 function display(){
     return(
         <div>
             <h2>Welcome to the react</h2>
             <Home />
             <Header />
             
         </div>  
     );
}
export default display