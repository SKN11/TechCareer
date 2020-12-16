import logo from './logo.svg';
import Contacts from './components/Contacts'

import './App.css';
import SignUpCard from './components/SignUpCard';

function App() {
  return (
    <div className="container-fluid">
      <nav>
        <div className="nav-wrapper center-align">
          <a href="/" className="brand-logo"></a>

        </div>
      </nav>
    { <div className="row"><Contacts/></div> }

    {/* <div className="row"><SignUpCard/></div> */}
    
    </div>
    
  );
}

export default App;
