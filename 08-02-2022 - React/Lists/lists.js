import React from 'react'

function Car(props){
    return(
        <div>
            <li>I am {props.brand}</li>
        </div>
    )
}
export default function Cars(){
    //Arrays
    const cars = ['KIA','MG','Tesla','McLawrance']
    return(
        <div>
        <h1>New car Companies</h1>
            <ul>
            {cars.map((car) => <Car brand ={car} />)} {/* property binding */}         
            </ul>
        </div>
    )
}