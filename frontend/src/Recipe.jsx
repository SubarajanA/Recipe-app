import { useState } from "react";
import { useParams } from "react-router";


function Recipe(){

    const [recipeData,setData] = useState();


    useEffect(()=>
    {
        const fetchData = async () => {
            try{
                const response = await axios.get(
                    `http://localhost:8080/home/viewrecipe/1`
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
    return(<>

    </>)
}
export default Recipe