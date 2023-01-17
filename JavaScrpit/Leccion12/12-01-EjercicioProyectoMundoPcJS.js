 class DispositivoEntrada {
constructor(tipoEntrada, marca){
    this._tipoEntrada = tipoEntrada;
    this._marca = marca;

}

get tipoEntrada(){
    return this._tipoEntrada;

}

get marca(){
    return this._marca;
}

set tipoEntrada(tipoEntrada){
    this._tipoEntrada;
}

set marca(marca){
    this._marca;
}


 }  

 class Raton extends DispositivoEntrada {
    static contadorRatones = 0;
    constructor(tipoEntrada, marca){
        super(tipoEntrada,marca);
        this._idRatones = ++Raton.contadorRatones;

    }
    get idRaton(){
        return this._idRatones;
       

        
    }

    toString(){
        return `Raton:[idRaton: ${this._idRatones} , tipoEntrada: ${this._tipoEntrada} , marca: ${this._marca}]`;


    }

 }

 class Teclado extends DispositivoEntrada {
    static contadorTeclados =0;
    constructor(tipoEntrada, marca){
    super(tipoEntrada, marca);
     this.idTeclado = ++Teclado.contadorTeclados;
    }

    toString(){
        return this.idTeclado;
    }

 }

 