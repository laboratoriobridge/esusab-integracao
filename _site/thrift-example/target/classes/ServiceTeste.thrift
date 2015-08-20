namespace java teste.thrift
namespace php teste.thrift

exception TesteException {
	1:i32 errorCode;
  	2:string msg;
}

struct DadoTeste {
	1:required i64 id;
	2:optional string message;
}

service TesteService {	
	bool transmit(1:DadoTeste dado)  throws (1:TesteException testeException);
}