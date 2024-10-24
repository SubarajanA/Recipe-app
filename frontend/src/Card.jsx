import { useEffect, useState } from "react"
import axios from "axios"
import {environment} from './environment/BaseUrl'

function Card(){


    const [Data, setData]=useState([]);
    const [username, setusername] = useState("")
    const [email, setEmail] = useState("")
    const [error,setError] = useState("")



    
    useEffect(()=>{
     setTimeout(()=>{
            const fetchData = async () => {
               
            }

            fetchData()
        },1000)

        
    },[]);
    // console.log(Data)

    const handelSubmit = async(e) =>{
        e.preventDefault()
      if(!username || !email){
        setError("Fill all the fields")
      } else {
        try {
            const response = await axios.post(
                `${environment.BaseURL}/newscore/login`,{
                    username: username,
                    email:email
                }
            ) ;
            console.log(response)
        }catch(err){
            console.log(err)
        }
      }
        
        
    }
    return(<>
    <div>
        {Data.map((match,id)=>(
            <h1>{match.matchname}</h1>
        ))}
    </div>
    {error ? <p>{error}</p>:""}
    <div>
        <form action="">
        <input type="text" onChange={e => setusername(e.target.value)} />
        <input type="text" onChange={e => setEmail(e.target.value)} />
        <button type="submit" onClick={handelSubmit}>Submit</button>
        </form>
    </div>
    </>)

}
export default Card