import React from "react";
import imagen from "./logo512.png"

const Pprincipal = () =>{

    return(
        <div>
            <div className='Acordeon mxauto'>
            <div position-absolute top-10 start-50 translate-middle mt-1>
            <div class="accordion" id="accordionExample">
                <div class="accordion-item">
                <h2 class="accordion-header" id="headingOne">
                    <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapseOne" aria-expanded="false" aria-controls="collapseOne">
                    Primer Modulo
                    </button>
                </h2>
                <div id="collapseOne" class="accordion-collapse collapse" aria-labelledby="headingOne" data-bs-parent="#accordionExample">
                    <div class="accordion-body">
                    En este modulo aprenderas acerca de como se dicen las letras en el lenguaje de señas peruano
                    <div>
                        <img src= {imagen} height= "220" width = "200"></img>
                        <img src= {imagen} height= "220" width = "200"></img>
                        <img src= {imagen} height= "220" width = "200"></img>
                        </div>   
                        <div>
                        <a name="" id="" class="btn btn-primary" href="#" role="button">Iniciar Modulo</a>
                        </div>
                    </div>
                </div>
                </div>
                
            </div>
            <div class="accordion" id="accordionExample">
                <div class="accordion-item">
                <h2 class="accordion-header" id="headingTwo">
                    <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                    Segundo Modulo
                    </button>
                </h2>
                <div id="collapseTwo" class="accordion-collapse collapse" aria-labelledby="headingTwo" data-bs-parent="#accordionExample">
                    <div class="accordion-body">
                    En este modulo aprenderas acerca de como se dicen las palabras en el lenguaje de señas peruano
                    <div>
                        <img src= {imagen} height= "220" width = "200"></img>
                        <img src= {imagen} height= "220" width = "200"></img>
                        <img src= {imagen} height= "220" width = "200"></img>
                        </div>   
                        <div>
                        <a name="" id="" class="btn btn-primary" href="#" role="button">Iniciar Modulo</a>
                        </div>
                    </div>
                </div>
                </div>
                <div class="accordion" id="accordionExample">
                <div class="accordion-item">
                <h2 class="accordion-header" id="headingTwo">
                    <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                    Tercer Modulo
                    </button>
                </h2>
                <div id="collapseThree" class="accordion-collapse collapse" aria-labelledby="headingThree" data-bs-parent="#accordionExample">
                    <div class="accordion-body">
                        En este modulo aprenderas acerca de como se dicen las oraciones en el lenguaje de señas peruano
                        <div>
                        <img src= {imagen} height= "220" width = "200"></img>
                        <img src= {imagen} height= "220" width = "200"></img>
                        <img src= {imagen} height= "220" width = "200"></img>
                        </div>   
                        <div>
                        <a name="" id="" class="btn btn-primary" href="#" role="button">Iniciar Modulo</a>
                        </div>         
                    </div>
                </div>
                </div>
                </div>
                </div>


            </div>

            </div>
        </div>

    )


};

export default Pprincipal