import { useState } from "react" 
import Hero1 from "./components/Hero1"
import Hero2 from "./components/Hero2"

const App = () => {

  const [count, setCount] = useState(0)
  const [customVal, setCustomVal] = useState(0);
 
  return (
    <div>
      <Hero1 count={count} setCount={setCount} customVal={customVal} setCustomVal={setCustomVal} />
      <Hero2 count={count} customVal={customVal} />
    </div>
  )
}

export default App
