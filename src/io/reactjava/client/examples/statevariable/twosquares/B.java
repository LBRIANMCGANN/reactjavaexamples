/*==============================================================================

name:       B.java

purpose:    Component B.

history:    Sat Oct 27, 2018 10:30:00 (Giavaneers - LBM) created

notes:

                        COPYRIGHT (c) BY GIAVANEERS, INC.
         This source code is licensed under the MIT license found in the
               LICENSE file in the root directory of this source tree.

==============================================================================*/
                                       // package --------------------------- //
package io.reactjava.client.examples.statevariable.twosquares;
                                       // imports --------------------------- //
import elemental2.dom.Event;
import io.reactjava.client.core.react.Component;
import io.reactjava.client.core.react.INativeEventHandler;
import io.reactjava.client.core.react.Properties;
import java.util.function.Consumer;
                                       // A ==================================//
public class B<P extends Properties> extends Component
{
                                       // class constants ------------------- //
public static final String kPROPERTY_ON                   = "on";
public static final String kPROPERTY_STATE_CHANGE_HANDLER = "statechangehandler";

                                       // class variables ------------------- //
                                       // (none)                              //
                                       // public instance variables --------- //
                                       // (none)                              //
                                       // protected instance variables -------//
                                       // (none)                              //
                                       // private instance variables -------- //
                                       // (none)                              //
/*------------------------------------------------------------------------------

@name       clickHandler - onClick event handler
                                                                              */
                                                                             /**
            onClick event handler as a public instance variable, accessible in
            markup.

@history    Thu Feb 14, 2019 10:30:00 (Giavaneers - LBM) created

@notes
                                                                              */
//------------------------------------------------------------------------------
public INativeEventHandler clickHandler = (Event e) ->
{
   ((Consumer)props().get(kPROPERTY_STATE_CHANGE_HANDLER)).accept("false");
};
/*------------------------------------------------------------------------------

@name       render - render component
                                                                              */
                                                                             /**
            Render component.

@history    Sat Oct 27, 2018 10:30:00 (Giavaneers - LBM) created

@notes

                                                                              */
//------------------------------------------------------------------------------
public final void render()
{
   String clas = "true".equals(props().getString(kPROPERTY_ON)) ? "on" : "off";
/*--
   <div class={clas} onClick={clickHandler} id="Bdiv"></div>
--*/
};
/*------------------------------------------------------------------------------

@name       renderCSS - get component css
                                                                              */
                                                                             /**
            Get component css.

@history    Sat Oct 27, 2018 10:30:00 (Giavaneers - LBM) created

@notes

                                                                              */
//------------------------------------------------------------------------------
public void renderCSS()
{
/*--
   .on
   {
      height:           300px;
      width:            300px;
      background-color: green;
   }
   .off
   {
      height:           300px;
      width:            300px;
      background-color: red;
   }
--*/
}
}//====================================// end B ==============================//
