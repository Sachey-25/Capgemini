import React from 'react'

class Header extends React.Component{
    constructor(props){
    super(props);
    this.state = { color : "Red" }
}
    //Check the component whether its mouting r no?
    componentDidMount(){
        setTimeout(() => {
            this.setState({color:"Yellow"})
        }, 4000)
    }
    shouldComponentUpdate(){
        return true;
    }
    changeColor=() => {
        setTimeout (() => {
            this.setState({color:"Blue"})
        }, 4000)
    }
    render(){
        return(
            <div>
                <h2>{this.state.color}</h2>
                <button type="button" onClick={this.changeColor}> changeColor..!!</button>
            </div>
        )
    }
}
export default Header