package org.apache.flume.sink;

import org.apache.flume.Context;
import org.apache.flume.Event;
import org.apache.flume.EventDeliveryException;

public class NullSink extends AbstractEventSink {

  @Override
  public void append(Context context, Event event)
      throws InterruptedException, EventDeliveryException {

    /* We purposefully do absolutely nothing. */

  }

}