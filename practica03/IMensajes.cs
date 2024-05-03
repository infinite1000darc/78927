using System;
using System.ServiceModel;

namespace imensajes{
    [ServiceContract]
    public interface IMensajes{
        [OperationContract]
        string saludar(string nombre);
        string mostrar(string nombre);
    }
}