/*==============================================================================

name:       SquareByRender.java

purpose:    Three By Three Square whose style is dynamically generated by
            the style attribute in render()

history:    Sat Oct 27, 2018 10:30:00 (Giavaneers - LBM) created

notes:
                        COPYRIGHT (c) BY GIAVANEERS, INC.
         This source code is licensed under the MIT license found in the
             LICENSE file in the root directory of this source tree.

==============================================================================*/
                                       // package --------------------------- //
package io.reactjava.client.examples.threebythree.progress;

                                       // imports --------------------------- //
import io.reactjava.client.core.react.Component;

                                       // SquareByRender =====================//
public class SquareByRender extends Component
{
                                       // class constants ------------------- //
                                       // (none)                              //
                                       // class variables ------------------- //
                                       // (none)                              //
                                       // public instance variables --------- //
                                       // (none)                              //
                                       // protected instance variables -------//
                                       // (none)                              //
                                       // private instance variables -------- //
                                       // (none)                              //
/*------------------------------------------------------------------------------

@name       render - render component
                                                                              */
                                                                             /**
            Render component. This implementation includes only markup.

@return     void

@history    Sat Oct 27, 2018 10:30:00 (Giavaneers - LBM) created

@notes
                                                                              */
//------------------------------------------------------------------------------
public void render()
{
   useState("color", "blue");
   String  color    = getStateString("color");
   String  posValue = "static";
   boolean bPending = "pending".equals(color);
   if (bPending)
   {
      color    = "white";
      posValue = "relative";
   }
                                       // use Paper instead of div to allow   //
                                       // non-string parameter 'clickhandler" //
                                       // to be passed as a property by parent//
                                       // which can't be done for div         //
/*--
   <@material-ui.core.Paper
      style='backgroundColor:{color};paddingTop:100%;position:{posValue};'
      onClick={props().get("clickhandler")}
   >
--*/
   if (bPending)
   {
/*--
      <@material-ui.core.CircularProgress
         style='zIndex:10;position:absolute;top:50%;left:50%;transform:translate(-50%, -50%);'
      />
--*/
   }
/*--
   </@material-ui.core.Paper>
--*/
}
}//====================================// end SquareByRender =================//
