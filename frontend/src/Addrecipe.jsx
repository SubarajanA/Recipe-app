import axios from "axios"
import { useState } from "react"

function Addrecipe(){
    const [dishname,setDishName] =useState()
    const [description,setDescription] =useState()
    const [instruction,setInstruction] = useState()
    const [ingredients,setIngredients] = useState()
    const [dishtype,setDishtype] = useState()
    const [cusinie,setCuisineame] = useState()

    const handleSubmit = async(e) =>{
        e.preventDefault()
        try{
            const response = await axios.post(
                `http://localhost:8080/home/addnewrecipe`,{
                    dishname:dishname,
                    description:description,
                    instruction:instruction,
                    ingredients:ingredients,
                    cusinie:cusinie,
                    dishtype:dishtype
                }
            )
        }
        catch(error){
            console.log(error)
        }
    }

    return(<div className="main">
        <h2>Add Dish Recipe</h2>
        <form className="form-data">
            dishname:<input className="text" type="text" onChange={e => setDishName(e.target.value)}/>
            description:<input className="text" type="text" onChange={e => setDescription(e.target.value)}/>
            instruction:<input className="text" type="text" onChange={e => setInstruction(e.target.value)}/>
            dishtype:<input className="text" type="text" onChange={e => setDishtype(e.target.value)}/>
            cuisinename:<input className="text" type="text" onChange={e => setCuisineame(e.target.value)}/>
            ingredients:<input className="text" type="text" onChange={e => setIngredients(e.target.value)}/> 
            <button  type="submit" className="text button"  onClick={handleSubmit}>ADD</button>
        </form>
    </div>)
}
export default Addrecipe