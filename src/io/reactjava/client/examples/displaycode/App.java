/*==============================================================================

name:       App.java

purpose:    Three By Three App.

history:    Sat Oct 27, 2018 10:30:00 (Giavaneers - LBM) created

notes:

                        COPYRIGHT (c) BY GIAVANEERS, INC.
         This source code is licensed under the MIT license found in the
               LICENSE file in the root directory of this source tree.

==============================================================================*/
                                       // package --------------------------- //
package io.reactjava.client.examples.displaycode;
                                       // imports --------------------------- //
import io.reactjava.client.components.generalpage.Prism;
import io.reactjava.client.core.react.AppComponentTemplate;
import io.reactjava.client.core.react.ReactElement;
import io.reactjava.client.core.react.ElementDsc;
import io.reactjava.client.core.react.Properties;
import io.reactjava.client.core.react.ReactJava;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
                                       // App ================================//
public class App extends AppComponentTemplate
{
                                       // class constants --------------------//
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

@name       getImportedNodeModules - get imported node modules
                                                                              */
                                                                             /**
            Get imported node modules.

@return     list of node module names.

@history    Sun Nov 02, 2018 10:30:00 (Giavaneers - LBM) created

@notes
                                                                              */
//------------------------------------------------------------------------------
protected List<String> getImportedNodeModules()
{
   return(Arrays.asList(
      "prismjs.components.prism-core",
      "prismjs.components.prism-clike",
      "prismjs.components.prism-java",
      "prismjs.themes.prism-okaidia.css"
   ));
}
/*------------------------------------------------------------------------------

@name       render - render component
                                                                              */
                                                                             /**
            Render component. This implementation is all markup, with no java
            code included.

@return     void

@history    Sat Oct 27, 2018 10:30:00 (Giavaneers - LBM) created

@notes
   Function<Properties, Element> fcn=(props) ->
   {
      ElementDsc root =
         ElementDsc.create(
            null,
            ReactJava.getRenderableComponent("io.reactjava.client.components.generalpage.Prism"),
            Properties.with("background", "#6dcff6", "id", getNextId()));

      ElementDsc elem =
         ElementDsc.create(root,
         "span",
         Properties.with("id", getNextId()),
         ".code\n/*==============================================================================\n\n");

      Element element = ElementDsc.createElement(root);
      return(element);
   };
   this.componentFcn = fcn;

   <React.Fragment>
      <div class="top" ></div>
      <Prism background='#6dcff6'>{text://text/displayCode}</Prism>
      <div class="bottom" ></div>
   </React.Fragment>

                                                                              */
//------------------------------------------------------------------------------
public void render()
{
/*--
   <Prism background='#6dcff6'>{text://text/displayCode}</Prism>
--*/
};
/*------------------------------------------------------------------------------

@name       renderCSS - get component css
                                                                              */
                                                                             /**
            Get component css.

@return     void

@history    Sat Oct 27, 2018 10:30:00 (Giavaneers - LBM) created

@notes

                                                                              */
//------------------------------------------------------------------------------
public void renderCSS()
{
/*--
   .top
   {
      height:           300px;
      width:            300px;
      background-color: green;
   }
   .bottom
   {
      height:           300px;
      width:            300px;
      background-color: red;
   }
   .token.comment
   {
      color: #6dcff6;
   }
--*/
}
}//====================================// end App ============================//