package com.corundumstudio.socketio.store.pubsub;

import java.io.Serializable;
import lombok.Data;

@Data
public abstract class PubSubMessage implements Serializable {

  private static final long serialVersionUID = -8789343104393884987L;

  private Long nodeId;
}
