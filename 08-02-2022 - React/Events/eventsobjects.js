import React from 'react'

function Machine(){
    //passing an arguments as a objects
    const fun=(a,b) => {
        alert(b.type)
        /* 'b' represents the react event that triggered the function.
        in this case the 'click' event */
    }
    return(
        <div>
            <button onClick={(event) => fun("This is an argument",event)}>Click me</button>
        </div>
    )
}
export default Machine;