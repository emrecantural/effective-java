package org.effective_java.example.item_12;

public class Request {

  public String header;
  public String body;

  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  //İstediğimiz tarzda bir toString kullanalım. Override edelim
  @Override
  public String toString() {
    return "Request: [header ="+ header+", body= "+body+"]";
  }


//  //Otomatik Jsona çevirme ->google ile
//  @Override
//  public String toString() {
//    return new com.google.gson.Gson.toJson (this);
//  }
}
