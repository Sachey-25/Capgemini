import React, { useState } from 'react'

function Myform(){
    //Create an array with the object to handle the function interface
    const [ inputs , setinputs ] = useState("")

    const handleChange = (event) => {
        const name = event.target.name;
        const value = event.target.value;
        setinputs(values => ({...values, [name]: value}))
    }
    const handleSubmit =(event) => {
        event.preventDefault()
        //alert(`The enter name is : ${name}`)
        console.log(inputs)
    }
    return(
        <div>
            <form onSubmit={handleSubmit}>
                <label>Enter your name :
                    <input type="text" 
                    name = "username"
                    value={ inputs.username || ""}
                    onChange={ handleChange }
                    />
                </label>
                <input type="submit" />
            </form>
        </div>
    )
}
export default Myform