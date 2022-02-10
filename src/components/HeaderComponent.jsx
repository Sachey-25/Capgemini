import React, {Component} from 'react'

class HeaderComponent extends Component{
    constructor(props){
        super(props)        
        this.state={

        }
    }
    render(){
        return(
            <div>
                <header>
                    <nav className='navbar navrbar-expand-md navbar-dark bg-dark'>
                        <div><a href="https://Techmasters.com" className ="navbar-brand">
                            Employee Management App
                        </a></div>
                    </nav>
                </header>
            </div>
        )
    }

}
export default HeaderComponent;