## OpenWire Protocol Library website

This maven project builds the OpenWire protocol library website content. Its mostly consists of markdown files you can view/edit directly or via github.

If you want to build the HTML yourself try:

```
mvn jetty:run
```

To generate the static html try:
```
mvn scalate:sitegen
```
