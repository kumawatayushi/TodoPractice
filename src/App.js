import './App.css';

import { Fragment,useEffect, useState } from 'react';

 

function App() {

  const [todoItems, setTodoItems]  = useState(null);

 

 useEffect(() => {

   console.log("hey.I've loaded up");

 

   if(!todoItems){

 

   fetch('http://localhost:8080/api/todoItems')

    .then((response) => response.json())

    .then(data => {

     console.log("Todo items lists:",data);

     setTodoItems(data);

   });

  }

 } , [todoItems] );

 

  return (

    <div>

      {todoItems ? todoItems.map((todoItem) => {

        return (

        <Fragment key={todoItem.id}> 

          <input type = "checkbox" checked={"todoItem.isDone"} /> 

          <span>{todoItem.task}</span>

        </Fragment>

      );

        }) 

        : 'loading data...'}

    </div>

     );    

}

 

export default App;
