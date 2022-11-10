# CEMO

Only edit `cemo.owl`.

Run the following two commands using [ROBOT](http://robot.obolibrary.org/convert.html) to generate OBO text and OBO Graph JSON files.

```bash
robot convert -i cemo.owl -o cemo.obo --check=false
robot convert -i cemo.owl -o cemo.json --check=false
```

TODO: better align with OBO standards so the `--check=false` can be removed.
