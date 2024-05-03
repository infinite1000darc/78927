using System;


namespace ICalculadora{
    [ServiceContract]
    public interface ICalculadora{
        [OperationContract]
        int suma(int a, int b);
        int resta(int a, int b);
    }
}

