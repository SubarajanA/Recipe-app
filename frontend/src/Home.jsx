import { useEffect, useState } from "react"

function Home(){

    const [data,setData]=useState([])

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
 

    return (<>
    </>)

}
export default Home