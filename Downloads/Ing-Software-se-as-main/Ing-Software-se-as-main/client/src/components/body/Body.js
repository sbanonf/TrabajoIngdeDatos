import React from 'react'
import { Routes, Route } from 'react-router-dom';
import Login from './auth/Login'
import Register from './auth/Register';
import Pprincipal from './auth/Pprincipal'
import ActivationEmail from './auth/ActivationEmail';

function Body() {
  return (
    <section>
      <Routes>
        <Route path='/' element={<Pprincipal />}/>
        <Route path='/login' element={<Login />} />
        <Route path='/register' element={<Register />} />
        <Route path='/user/activate/:activation_token' element={<ActivationEmail />} />
      </Routes>
    </section>
  )
}

export default Body