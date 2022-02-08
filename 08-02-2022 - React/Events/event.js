import React from  'react'

function Example(){
    //Passing the arguments to the function
    const shot = (props) => {
        alert(props)
    }
    return(
        <div>
            
            <button onClick={ () => shot("That's Six!")}>Take a Shot</button>
        </div>
    )
}
export default Example