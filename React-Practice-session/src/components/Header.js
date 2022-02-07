//Argument to the functional components
import React from 'react'

const Header = (props) =>{
    return(
        <header>
            <h1>{props.title}</h1>
        </header>
    )
}
Header.defaultProps ={
    title : 'TechMasters',

}
export default Header

//Header title : TechMasters