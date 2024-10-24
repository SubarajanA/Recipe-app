import axios from "axios";
import { useEffect, useState } from "react"
import r2 from './assets/r2.jpg'
import { Button } from 'react-bootstrap';


function Profile(){

    const [recipeData,setData] = useState([]);
    const [id,setId]=useState();

    useEffect(()=>
    {
        const fetchData = async () => {
            try{
                const response = await axios.get(
                    `http://localhost:8080/home/viewrecipe`
                );
                console.log(response.data)
                setData(response.data);
            }
            catch(error){
                console.log(error)
            }
            
        };
        fetchData();
    },[]);
    function handledelete(id){
        const response = axios.delete(
             `http://localhost:8080/home/removerecipe/${id}`)
    }


    return(
        <div>
            <div className="recipe">
                {recipeData.map((recipe,id)=>(
                    <div className="recipe-card">
                        <p>DISH NAME:{recipe.dishname}</p>
                        <p>DESCRITION:{recipe.description}</p>
                        <Button onclick={handledelete({recipe.dishid})}>DELETE</Button>
                    </div>
                ))}
            </div>
          </div> )
}
export default Profile