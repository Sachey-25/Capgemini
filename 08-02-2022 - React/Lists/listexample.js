import React from 'react'

function Result(props){
    return(
        
        <div>
        {/* Dont not tyoe anything over here, If that so this becomes recursion */}
            <li> Courses are : {props.name} </li>
        </div>
    )
}

export default function Coding(){
    //we are creating an array with the object reference
    let courses = [ {id:1010, name :"Java-Programming"},
     {id:1011, name:"Python-Programming"},
     {id:1012, name:"React-Web development"},
     {id:1013, name:"Java Fullstack"} ]
return(
    <div>
        <h1>We are producing courses interms of list</h1>
        {/* We all know that in order to make th e list we will
         use <ul> or <ol> with respect to <li> */}
         <ul>
             {/* in ul tag understand we always perform property binding mechanism */}
             { courses.map( (object) => <Result key={object.id} name={object.name} />)}
             {/* another function where I can access the array elements */}
         </ul>
    </div>
)}