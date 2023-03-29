package hu.nye.webhw.response;

import java.util.List;

public class ErrorResponse {

  private List<String> messages;

  public ErrorResponse(List<String> messages) {
    this.messages = messages;
  }

  public List<String> getMessages() {
    return messages;
  }
}
