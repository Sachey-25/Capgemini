import React from 'react'

function Best(props){
    return(
        <div>
            <li>I am another { props.brand }</li>
        </div>
    )
}
export default function Garage(){
    const cars_info=[
        {id:1, brand:'KiA'},
        {id:2, brand:'MG'},
        {id:3, brand:'Tesla'}]
return(
    <div>
        <h1>React lists using keys</h1>
        <ul>
            { cars_info.map( (obj) => <Best key={obj.id} brand={obj.brand} />)}
        </ul>
    </div>
)}