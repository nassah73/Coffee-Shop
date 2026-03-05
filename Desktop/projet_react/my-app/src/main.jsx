export default function main(){
    return(
   <div className="main">
    <Header></Header>
   </div>
    )
}
function Header(){
    return (
        <header className="header">
            <h1 className="logo">BuyWatchs</h1>
            <nav className="nav-bar">
                 <ul>
                    <li>watches</li>
                    <li>wrranty & service</li>
                    <li>stores</li>
                 </ul>
            </nav>
            <nav className="drop-down">

            </nav>
        </header>
    )
}