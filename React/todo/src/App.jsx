import { useState, useEffect } from 'react';
import Cards from './components/Cards.jsx';

function App() {

  const [title , setTitle ] = useState('');
  const [description , setDescription ] = useState('');
  const [showArchive , setShowArchive ] = useState(false);
  const [count , setCount ] = useState(0);
  


  const [TaskList , setTaskList ] = useState([]); 
  const [archiveNoteList , setArchiveNoteList ] = useState([]); 


  // useEffect(()=>{
  //     console.log("TaskList" , TaskList);
  //     console.log("archiveNoteList" , archiveNoteList);
  // },[TaskList , archiveNoteList, title]);


  const handleSubmit = (e) => {

    e.preventDefault();
    const note = {
      id : Date.now(),
      title : title,
      description : description
    }

    TaskList.push(note);

    setTaskList(TaskList);
    setTitle('');
    setDescription('');

  }

  const handleDelete = (id) => {
    const updatedList = TaskList.filter((note) => note.id !== id);
    const archivedNotes = TaskList.filter((note) => note.id === id);
    setTaskList(updatedList);
    setArchiveNoteList([...archiveNoteList, ...archivedNotes]);
  }

  return (
    <div>
      <div className='flex justify-center'>
        <h1>To Do List</h1>
        <form onSubmit={handleSubmit} className='flex flex-col max-w-md'>
          <input className='border border-gray-300 rounded-md p-2 mb-2' type="text" value={title}  onChange={(e)=>{setTitle(e.target.value)}}/>
          <textarea className='border border-gray-300 rounded-md p-2 mb-2' value={description}  onChange={(e)=>{setDescription(e.target.value)}}/>
          <button type="submit">Add Task</button>
        </form>
      </div>
        

      <hr />

      {TaskList.length === 0 ? <p>List is empty add new task</p> : 
      TaskList.map((note , key)=>
          // <div key={key}>
          //   <h2>Title : {note.title}</h2>
          //   <p> Description : {note.description}</p>
          //   <button onClick={() => handleDelete(note.id)}> Delete</button>
          // </div>
          <Cards key={key} note={note} handleDelete={handleDelete} isTaskList={true} count={count} setCount={setCount} />
      )
    }

    <button onClick={() => setShowArchive(!showArchive)}> Show Archive List</button>
    {showArchive &&
      <div>
        <h1>Archive List</h1>
        <div >
          {archiveNoteList.length === 0 ? <p>Archive list is empty</p> : 
        archiveNoteList.map((note , key)=>
          // <div key={key}>
          //   <h2>Title : {note.title}</h2>
          //   <p> Description : {note.description}</p>
          // </div>
          <Cards key={key} note={note} isTaskList={false} count={count} setCount={setCount} />
      )
    }

        </div>
        
      </div>
    }
    </div>
  )
}

export default App
