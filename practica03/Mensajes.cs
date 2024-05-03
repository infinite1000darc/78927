using System;
using System.ServiceModel;

namespace Mensajes{
    public class Mensajes : IMensajes{
        public string saludar(string nombre){
            return "hola "+nombre;
        }
        public string mostrar(string nombre){
            return "X";
        }
    }
}